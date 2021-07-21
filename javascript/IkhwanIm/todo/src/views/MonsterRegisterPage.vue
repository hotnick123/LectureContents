<template>
  <div align="center">
    <h2>몬스터 등록</h2>
    <monster-register-form @submit="onSubmit"/>
  </div>
</template>

<script>
import MonsterRegisterForm from "../components/monster/MonsterRegisterForm";
import axios from 'axios'
export default {
  name: 'MonsterRegisterPage',
  components: {
    MonsterRegisterForm
  },
  methods: {
    onSubmit (payload) {
      const { monster_name, hp, exp, money } = payload
      axios.post(`http://localhost:7777/vuemonster/register`, { monster_name, hp, exp, money })
          .then(res => {
            alert('등록 성공! - ' + res)
            console.log('몬스터 번호: ' + res.data.monsterNo.toString())
            this.$router.push({
                name: 'MonsterListPage',
            })
          })
          .catch(res => {
            alert(res.response.data.message)
          })
    }
  }
}
</script>