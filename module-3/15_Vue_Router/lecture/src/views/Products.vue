<template>
  <div class="products">
    <h1>products</h1>
    <product-list></product-list>
  </div>
</template>

<script>
import ProductList from "@/components/ProductsList.vue"; // @ = alias for source folder
export default {
  components: {
    ProductList,
  },
};
</script>

<style lang="scss" scoped>
</style>