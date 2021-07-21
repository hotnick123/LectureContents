<template>
  <div>
    <h3>몬스터 목록</h3>
    <table border="1">
      <tr>
        <th align="center" width="100">몬스터번호</th>
        <th align="center" width="450">몬스터이름</th>
        <th align="center" width="150">HP</th>
        <th align="center" width="150">EXP</th>
        <th align="center" width="150">MONEY</th>
        <th align="center" width="240">등록일자</th>
      </tr>
      <tr v-if="!monsters || (Array.isArray(monsters) && monsters.length === 0)">
        <td colspan="4">
          현재 등록된 몬스터가 없습니다!
        </td>
      </tr>
      <tr v-else v-for="monster in monsters" :key="monster.monsterNo">
        <td align="center">{{ monster.monsterNo }}</td>

        <td align="left">
          <router-link :to="{ name: 'MonsterReadPage',
                                    params: { monsterNo: monster.monsterNo.toString() } }">
            {{ monster.monster_name }}
          </router-link>
        </td>
        <!-- <td align="center">{{ product.product_name }}</td>-->
        <td align="center">{{ monster.hp }}</td>
        <td align="center">{{ monster.exp }}</td>
        <td align="center">{{ monster.money }}</td>
        <td align="center">{{ monster.regDate }}</td>
      </tr>
    </table>
  </div>
</template>

<!-- <td align="left">

                    <router-link :to="{ name: 'ProductReadPage',
                                    params: { boardNo: product.productNo.toString() } }">
                        {{ product.product_name }}
                    </router-link>
                </td> -->

<script>
export default {
  name: 'MonsterLists',
  props: {
    monsters: {
      type: Array
    }
  }
}
</script>