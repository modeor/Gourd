import axios from './axios'

/* 
 * 将所有接口统一起来便于维护
 * 如果项目很大可以将 url 独立成文件，接口分成不同的模块
 */

// 单独导出
export const login = data => {
  return axios({
    url: '?s=App.User_User.Login',
    method: 'post',
    data
  })
}

export const getUser = () => {
  return axios({
    url: '/user',
    method: 'get'
  })
}

export const getMenu = data => {
  return axios({
    url: '/getMenu',
    method: 'post',
    data
  })
}

export const post = data => {
  return axios({
    url: data.url,
    method: 'post',
    data: data.param
  })
}
// 默认全部导出
export default {
  post,
  login,
  getUser,
  getMenu
}