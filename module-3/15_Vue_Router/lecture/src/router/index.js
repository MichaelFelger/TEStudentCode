import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products'
import ProductDetail from '@/views/ProductDetail'
import AddReview from '@/views/AddReview'

Vue.use(VueRouter) //will inject vueRouter into our components and views - access with $VueRouter

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products,
  },
  {
    path: '/products/:id', // this is a path variable, like in module 2 - officially a 'dynamic route'
    name: "product-details",
    component: ProductDetail,
  },
  {
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReview,
  },
]

const router = new VueRouter({
  mode: 'history', // allows Vue to manipulate the history info and endpoints in the browser
  base: process.env.BASE_URL,
  routes
})

export default router
