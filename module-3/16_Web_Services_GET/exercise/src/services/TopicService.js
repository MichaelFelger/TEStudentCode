import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  getList() {
    return http.get('/topics');
  },

  get(id) {
    return http.get(`/topics/${id}`);
  }

}