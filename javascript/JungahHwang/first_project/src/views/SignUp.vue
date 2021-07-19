<template>
  <div>
    <h3>회원가입</h3>
    <sign-up-form @submit="onSubmit"></sign-up-form>
  </div>
</template>


<script>
import axios from 'axios'
import SignUpForm from '../components/SignUpForm.vue'

export default {
  name: 'SignUp',
  components: {
    SignUpForm
  },
  methods: {
    onSubmit (payload) {
      const { id, pw, name, gender, birth, email, tel, addr } = payload
      axios.post('http://localhost:7777/vue/signup', { id, pw, name, gender, birth, email, tel, addr })
      .then(res => {
        alert('성공!' + res)
      }).catch(res => {
        alert(res)
      })
    }
  }
}
</script>