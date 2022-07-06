<template>
  <div class="login-container">
    <el-form
      :model="user"
      :rules="rules"
      status-icon
      ref="user"
      label-position="left"
      label-width="0px"
      class="demo-ruleForm login-page"
    >
      <h3 class="title">系统登录</h3>
      <el-form-item prop="username">
        <el-input
          type="text"
          v-model="user.username"
          auto-complete="off"
          placeholder="用户名"
        ></el-input>
      </el-form-item>
      <el-form-item prop="password">
        <el-input
          type="password"
          v-model="user.password"
          auto-complete="off"
          placeholder="密码"
        ></el-input>
      </el-form-item>
      <!-- <el-checkbox v-model="checked"
                   class="rememberme">记住密码</el-checkbox> -->
      <el-form-item style="width: 100%">
        <el-button
          type="primary"
          style="width: 48%"
          @click.native.prevent="reset"
          >重 置</el-button
        >
        <el-button
          type="primary"
          style="width: 48%"
          @click="login"
          :loading="logining"
          >登录</el-button
        >
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import Cookies from 'js-cookie'

export default {
  name: 'LoginView',
  data () {
    return {
      logining: false,
      user: {
        username: '',
        password: '123456'
      },
      rules: {
        username: [{ required: true, message: '请输入账号', trigger: 'blur' }],
        password: [{ required: true, message: '请输入密码', trigger: 'blur' }]
      },
      checked: true
    }
  },
  methods: {
    login () {
      const userInfo = { username: this.user.username, password: this.user.password }

      this.$refs.user.validate((valid) => {
        if (valid) {
          this.logining = true
          this.$api.post({ url: '?s=App.User_User.Login', param: userInfo }).then((res) => {
            if (res.ret === 200) {
              Cookies.set('token', res.data.token) // 放置token到Cookie
              sessionStorage.setItem('user', userInfo.username)// 保存用户到本地会话
              this.$router.push({ path: '/infomation' }) // 登录成功，跳转到主页
            } else {
              this.logining = false
            }
          }).catch(function (res) {
            alert(res)
          })
        } else {
          console.log('error submit!')
          return false
        }
      })
    }
  }
}
</script>

<style scoped>
.login-container {
  width: 100%;
  height: 100%;
}
.login-page {
  -webkit-border-radius: 5px;
  border-radius: 5px;
  margin: 180px auto;
  width: 350px;
  padding: 35px 35px 15px;
  background: #fff;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
}
label.el-checkbox.rememberme {
  margin: 0px 0px 15px;
  text-align: left;
}
</style>
