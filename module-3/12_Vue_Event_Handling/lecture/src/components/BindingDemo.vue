<template>
  <div>
    <label for="username">Username</label>
    <input type="text" id="username" v-model.number="selectedUser" />

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

    <label for="chips">Chips</label>
    <input
      type="checkbox"
      name="chips"
      id="chips"
      value="chips"
      v-model="selectedItems"
    />
    <label for="soup">Soup</label>
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
      selectedUser: "",
      selectedColor: "",
      selectedItems: [],
    };
  },
};
</script>

<style lang="scss" scoped>
</style>