<template>
  <div>
    <label for="username">Username</label>
    <input type="number" id="username" v-model.number="selectedUser" />

    <label for="red">Red</label>
    <input
      type="radio"
      name="color"
      id="red"
      value="red"
      v-model="selectedColor"
    />
    <label for="green">Green</label>
    <input
      type="radio"
      name="color"
      id="green"
      value="green"
      v-model="selectedColor"
    />
    <br />

    <label for="chips">chips</label>
    <input
      type="checkbox"
      name="chips"
      id="chips"
      value="chips"
      v-model="selectedItems"
    />
    <label for="soup">soup</label>
    <input
      type="checkbox"
      name="soup"
      id="soup"
      value="soup"
      v-model="selectedItems"
    />
  </div>
</template>

<script>
export default {
  name: "BindingDemo",
  data() {
    return {
      selectedUser: 0,
      selectedColor: "",
      selectedItems: [],
    };
  },
};
</script>

<style lang="scss" scoped>
</style>