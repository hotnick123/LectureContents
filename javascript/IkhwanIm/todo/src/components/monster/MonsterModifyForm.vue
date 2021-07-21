<template>
  <div>
    <h3>Monster Modified Form</h3>
    <form @submit.prevent="onSubmit">
      <table>
        <tr>
          <td>몬스터번호</td>
          <td><input type="text" :value="monster.monsterNo" disabled></td>
        </tr>
        <tr>
          <td>몬스터이름</td>
          <td><input type="text" v-model="monster_name"></td>
        </tr>
        <tr>
          <td>HP</td>
          <td><input type="text" v-model="hp"></td>
        </tr>
        <tr>
          <td>EXP</td>
          <td><input type="text" v-model="exp"></td>
        </tr>
        <tr>
          <td>MONEY</td>
          <td><input type="text" v-model="money"></td>
        </tr>
        <tr>
          <td>등록일자</td>
          <td><input type="text" :value="monster.regDate" disabled></td>
        </tr>
      </table>

      <div>
        <button type="submit">수정 완료</button>
        <router-link :to="{ name: 'MonsterReadPage', params: { monsterNo: monster.monsterNo.toString() } }">
          취소하기
        </router-link>
      </div>
    </form>
  </div>
</template>

<script>
export default {
  name: 'MonsterModifyForm',
  props: {
    monster: {
      type: Object,
      required: true
    }
  },
  data () {
    return {
      monster_name: '',
      hp: '',
      exp:'',
      money:'',
    }
  },
  methods: {
    onSubmit () {
      const { monster_name, hp, exp, money } = this
      this.$emit('submit', { monster_name, hp, exp, money })
    }
  },
  created () {
    this.monster_name = this.monster.monster_name
    this.hp = this.monster.hp
    this.exp = this.monster.exp
    this.money = this.monster.money
  }
}
</script>