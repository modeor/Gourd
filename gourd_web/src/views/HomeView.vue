<template>
  <el-container class="container">
    <el-header class="header">
      <el-row>
        <el-col :span="16">
          <div>
            <img
              style="
                width: 140px;
                heigth: 30px;
                display: inline;
                float: left;
                padding-left: 60px;
              "
              src=""
              alt="无法显示图片"
            />
          </div>
        </el-col>
      </el-row>
    </el-header>
    <el-container class="waist">
      <el-aside class="aside">
        <el-menu default-active="1" class="el-menu-vertical-demo">
          <el-submenu index="1">
            <template v-slot:title>
              <i class="el-icon-menu"></i>
              <span>项目管理</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="1-1" @click="$router.push('infomation')"
                >信息录入</el-menu-item
              >
              <el-menu-item index="1-2" @click="$router.push('overView')"
                >项目总览</el-menu-item
              >
            </el-menu-item-group>
          </el-submenu>
          <!-- <el-submenu index="2">
            <template slot="title">
              <i class="el-icon-menu"></i>
              <span>报价管理</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="2-1">价格配置</el-menu-item>
              <el-menu-item index="2-2">产品报价</el-menu-item>
            </el-menu-item-group>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title">
              <i class="el-icon-menu"></i>
              <span>系统管理</span>
            </template>
            <el-menu-item-group>
              <el-menu-item index="3-1">用户管理</el-menu-item>
              <el-menu-item index="3-2">角色管理</el-menu-item>
            </el-menu-item-group>
          </el-submenu> -->
        </el-menu>
      </el-aside>
      <el-main class="main">
        <section class="content-container">
          <div class="grid-content bg-purple-light">
            <el-col :span="24" class="breadcrumb-container">
              <el-breadcrumb separator="/" class="breadcrumb-inner">
                <el-breadcrumb-item
                  v-for="item in $route.matched"
                  :key="item.path"
                >
                  {{ item.name }}
                </el-breadcrumb-item>
              </el-breadcrumb>
            </el-col>
            <el-col :span="24" class="content-wrapper">
              <transition name="fade" mode="out-in">
                <router-view></router-view>
              </transition>
            </el-col>
          </div>
        </section>
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {

  name: 'HomeView'

}
</script>

<style scoped>
.container {
  height: 95vh;
  font-size: 15px;
}
.waist {
  height: 650px;
}
.header {
  background: #fff;
  color: #fff;
  border-bottom: 1px solid #909399;
}
.aside {
  background: #fff;
  color: #fff;
  height: 640px;
  border-right: 1px solid #909399;
}
.main {
  /* height: 100%; */
  color: #212121;
  padding-bottom: 0;
  height: 630px;
}
.headerlogo {
  line-height: 60px;
  margin-top: 10px;
}
.rightsection {
  line-height: 60px;
  text-align: center;
}
</style>