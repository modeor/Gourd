import axios from 'axios'
import { MessageBox, Message } from 'element-ui'
import store from '@/store'
import { getToken } from '@/utils/auth'
import router from '@/router'

// create an axios instance
const service = axios.create({
  baseURL: process.env.VUE_APP_BASE_API, // url = base url + request url
  // withCredentials: true, // send cookies when cross-domain requests
  timeout: 5000 // request timeout
})

// request 请求拦截器
service.interceptors.request.use(
  config => {
    // do something before request is sent

    if (store.getters.token) {
      // let each request carry token
      // ['X-Token'] is a custom headers key
      // please modify it according to the actual situation
      config.headers['Authorization'] = 'Bearer ' + getToken() // 改成后端要求的token键值
    }
    return config
  },
  error => {
    // do something with request error
    console.log(error) // for debug
    return Promise.reject(error)
  }
)

// response 响应拦截器
service.interceptors.response.use(
  /**
   * If you want to get http information such as headers or status
   * Please return  response => response
  */

  /**
   * Determine the request status by custom code
   * Here is just an example
   * You can also judge the status by HTTP Status Code
   */
  response => {
    const res = response.data
    const code = res.code
    const message = res.data
    // 如果code不等于0，表示有错误
    if (res.code !== 0) {
      switch (code) { // 响应错误判断
        case 401:
          if (router.currentRoute.name === 'login') {
            return Promise.reject(new Error(message))
          } else {
            Message({
              message: '您没有权限访问该资源',
              type: 'error'
            })
          }
          break
        case 403:
          Message({
            message: message,
            type: 'error'
          })
          break
        case 500:
          Message({
            message: '服务异常，请联系管理员',
            type: 'error'
          })
          break
        default:
          Message({
            message: message,
            type: 'error'
          })
      }

      return Promise.reject(new Error(res.message || 'Error'))
    } else {
      return res
    }
  },
  error => {
    console.log('err' + error) // for debug
    Message({
      message: error.message,
      type: 'error',
      duration: 5 * 1000
    })
    return Promise.reject(error)
  }
)

export default service
