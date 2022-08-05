<template>
  <div>
    <input type="text" v-model="stateAbbrev" />
    <button type="submit" @click="getCities">Submit</button>
    <ul>
        <li v-for="city in cities" :key="city.id">{{ city.name }}</li>
    </ul>
  </div>
</template>

<script>

import cityService from '@/services/CityService.js';

export default {

    data() {
        return {
            stateAbbrev : "",
            cities: []
        }
    },
    methods: {
        getCities() {
            cityService.getCities(this.stateAbbrev).then(r =>
            { this.cities = r.data; } );
        }
    }

}
</script>

<style>

</style>