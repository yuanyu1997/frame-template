import Vue from 'vue'
import App from './App.vue'
import store from './store/index.js'

Vue.config.productionTip = false

new Vue({
    store, // 挂载
    render: h => h(App),
}).$mount('#app')
