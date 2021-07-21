<template>
  <form @submit.prevent="onSubmit">
    <h3>몬스터 등록 형태</h3>
    <table>
      <tr>
        <td>몬스터 이름</td>
        <td><input type="text" v-model="monster_name"></td>
      </tr>
      <tr>
        <td>체력</td>
        <td><input type="text" v-model="hp"></td>
      </tr>
      <tr>
        <td>경험치</td>
        <td><input type="text" v-model="exp"></td>
      </tr>
      <tr>
        <td>돈</td>
        <td><input type="text" v-model="money"></td>
      </tr>
    </table>

    <div>
      <button type="submit">생성하기</button>
      <router-link :to="{ name: 'MonsterListPage' }">
        취소
      </router-link>
    </div>
  </form>
</template>

<script>
export default {
  name: 'MonsterRegisterForm',
  data () {
    return {
      monster_name: '',
      hp: '',
      exp: '',
      money: '',
    }
  },
  methods: {
    onSubmit () {
      const { monster_name, hp, exp, money } = this
      this.$emit('submit', { monster_name, hp, exp, money })
    }
  }
}
</script>