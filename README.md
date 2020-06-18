# Online-Education-Project
基于SpringBoot+SpringCloud的分布式微服务在线教育项目，前后端分离

# 项目预览

本项目分为三个部分：后端、管理员前端、普通用户前端。

后端代码文件夹为education_parent。

管理员前端文件夹为education_admin_front_end。

管理员前端首页预览：

![管理员前端首页](https://boker-pic.oss-cn-beijing.aliyuncs.com/edu/edu1.jpg?Expires=1592443249&OSSAccessKeyId=TMP.3KieaUWywvwetG55EGtxD8LjxL2A3wVFwEvVworoPCFPs9hU79zgVsfzRJuE26trX1oW95Gz4ZTDFxNCF53Um4NENomR3U&Signature=beAGqse05u7ZSjCEcCCiGjM8AkQ%3D)

普通用户前端文件夹为education_user_front_end。

普通用户前端首页预览：

![普通用户前端首页](https://boker-pic.oss-cn-beijing.aliyuncs.com/edu/edu2.jpg?Expires=1592443482&OSSAccessKeyId=TMP.3KieaUWywvwetG55EGtxD8LjxL2A3wVFwEvVworoPCFPs9hU79zgVsfzRJuE26trX1oW95Gz4ZTDFxNCF53Um4NENomR3U&Signature=vXptmjor87VAH3RYNQosRzoxXtk%3D)

------------------



![普通用户前端首页2](https://boker-pic.oss-cn-beijing.aliyuncs.com/edu/edu3.jpg?Expires=1592443533&OSSAccessKeyId=TMP.3KieaUWywvwetG55EGtxD8LjxL2A3wVFwEvVworoPCFPs9hU79zgVsfzRJuE26trX1oW95Gz4ZTDFxNCF53Um4NENomR3U&Signature=1Zepb2nG7%2BrgxtD0gKWoTobxC3g%3D)

--------------------



![普通用户前端首页3](https://boker-pic.oss-cn-beijing.aliyuncs.com/edu/edu4.jpg?Expires=1592443543&OSSAccessKeyId=TMP.3KieaUWywvwetG55EGtxD8LjxL2A3wVFwEvVworoPCFPs9hU79zgVsfzRJuE26trX1oW95Gz4ZTDFxNCF53Um4NENomR3U&Signature=qAPd8jYhNeOtlYoIznRkd%2BjyYwc%3D)

# 技术栈

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

