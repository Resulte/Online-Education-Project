# Online-Education-Project
基于SpringBoot+SpringCloud的分布式微服务在线教育项目，前后端分离

# 项目预览

本项目分为三个部分：后端、管理员前端、普通用户前端。

后端代码文件夹为education_parent。

管理员前端文件夹为education_admin_front_end。

后台管理系统包括：讲师管理、课程分类管理、课程管理、统计分析、Banner管理、订单管理、权限管理等功能。

管理员前端首页预览：

![管理员前端首页](https://edu-boker.oss-cn-beijing.aliyuncs.com/edu1.jpg)

普通用户前端文件夹为education_user_front_end。

前台用户系统包括：首页、课程、名师、问答、文章。

普通用户前端首页预览：

![普通用户前端首页](https://edu-boker.oss-cn-beijing.aliyuncs.com/edu2.jpg)

------------------



![普通用户前端首页2](https://edu-boker.oss-cn-beijing.aliyuncs.com/edu3.jpg)

--------------------



![普通用户前端首页3](https://edu-boker.oss-cn-beijing.aliyuncs.com/edu4.jpg)

# 技术栈

在线教育系统，分为前台网站系统和后台运营平台，B2C模式。

使用了微服务技术架构，前后端分离开发。

后端的主要技术架构是：SpringBoot + SpringCloud + MyBatis-Plus + HttpClient + MySQL + Maven+EasyExcel+ nginx

前端的架构是：Node.js + Vue.js +element-ui+NUXT+ECharts

其他涉及到的中间件包括Redis、阿里云OSS、阿里云视频点播

业务中使用了ECharts做图表展示，使用EasyExcel完成分类批量添加、注册分布式单点登录使用了JWT

项目系统框图：

![项目系统框图](https://edu-boker.oss-cn-beijing.aliyuncs.com/edu/edu5.png)

## 后端技术

系统后端接口部分，使用目前流行的SpringBoot+SpringCloud进行微服务架构，使用Feign、Gateway、Hystrix，以及阿里巴巴的Nacos等组件搭建了项目的基础环境。

项目中还使用MyBatisPlus进行持久层的操作，使用了OAuth2+JWT实现了分布式的访问，项目中整合了SpringSecurity进行了权限控制。

使用了阿里云oss对象存储进行图片文件和视频文件的存储，使用了阿里云点播系统进行视频的上传和播放，还使用了阿里云短信服务发送手机验证码注册用户。

除此之外，项目中使用了阿里巴巴的EasyExcel实现对Excel的读写操作，使用了Redis进行首页数据的缓存，还整合了Swagger进行接口测试和生成接口文档 。

## 前端技术

系统前端部分，使用主流的前端框架Vue，使用Es6的开发规范，采用模块化的开发模式，搭建普通用户前端环境使用了Nuxt框架，搭建管理员前端使用了vue-admin-template模板，使用Element-ui进行页面布局。

前端环境中使用Npm进行依赖管理，使用Babel进行代码转换，使用Webpack进行静态资源的打包，采用axios进行Ajax请求调用，使用了ECharts进行数据的图表展示。

# 项目测试

后端的阿里云API的ID和密钥请先换成自己的。

确保nacos和redis打开。

前端运行确保电脑安装了Node.js环境，运行下面命令，即可运行前端页面：

```
$ npm install # Or yarn install  #安装依赖


$ npm run dev # 运行项目
```

