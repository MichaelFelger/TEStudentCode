import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products.vue'
import ProductDetail from '@/views/ProductDetail'
import AddReview from '@/views/AddReview'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'products',
        component: Products,
    },
    {
        path: '/products/:id', // path variable
        name: 'product-details',
        component: ProductDetail,
    },
    {
        path: '/products/:id/add-review',
        name: 'add-review',
        component: AddReview,
    },
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
})

export default router
