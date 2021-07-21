<template>
  <div>
    <h3>Vue + Spring + DB 몬스터 세부사항 보기</h3>
    <table>
      <tr>
        <td>몬스터번호</td>
        <td><input type="text" :value="monster.monsterNo" readonly></td>
      </tr>
      <tr>
        <td>몬스터이름</td>
        <td><input type="text" :value="monster.monster_name" readonly></td>
      </tr>
      <tr>
        <td>HP</td>
        <td><input type="number" :value="monster.hp" readonly></td>
      </tr>
      <tr>
        <td>EXP</td>
        <td><input type="text" :value="monster.exp" readonly></td>
      </tr>
      <tr>
        <td>MONEY</td>
        <td><input type="text" :value="monster.money" readonly></td>
      </tr>
      <tr>
        <td>등록일자</td>
        <td><input type="text" :value="monster.regDate" readonly></td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: 'MonsterRead',
  props: {
    monster: {
      type: Object,
      required: true
    }
  }
}
</script>