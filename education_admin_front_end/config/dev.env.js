'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')
const defaultForm = {
    avatar: 'https://edu-202.oss-cn-beijing.aliyuncs.com/2020/06/05/cabf100d52654f4fb46a8658c14e8070file.png'
  }
module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  //BASE_API: '"https://easy-mock.com/mock/5950a2419adc231f356a6636/vue-admin"',
  BASE_API: '"http://localhost:8222"',
})