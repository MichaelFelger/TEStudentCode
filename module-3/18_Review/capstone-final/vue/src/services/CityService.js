import axios from 'axios';

export default {
    getCities(stateAbbrev) {
        return axios.get(`/states/${stateAbbrev}/cities`);
    }
}