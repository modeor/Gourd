export default {
  method: 'get',
  //URL前缀
  baseURL: '/api',
  //请求头
  headers: {
    get: {
      'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'
      // 在开发中，一般还需要单点登录或者其他功能的通用请求头，可以一并配置进来
    },
    post: {
      'Content-Type': 'application/json;charset=utf-8'
      // 在开发中，一般还需要单点登录或者其他功能的通用请求头，可以一并配置进来
    }
  },
  //参数
  data: {},
  //超时时间
  timeout: 10000,
  //携带凭证
  withCredentials: true,
  //返回类型
  responseType: 'json'
}