<template>
    <div align="center">
        <h3>상품목록 목록</h3>
        <table border="1">
            <tr>
                <th align="center" width="100">번호</th>
                <th align="center" width="350">몬스터 이름</th>
                <th align="center" width="350">체력</th>
                <th align="center" width="240">공격력</th>
                <th align="center" width="440">생성날짜</th>
            </tr>
            <tr v-if="!monsters || (Array.isArray(monsters) && monsters.length === 0)">
                <td colspan="4">
                현재 등록된 상품이 없습니다!
                </td>
            </tr>
            <tr v-else v-for="monster in monsters" :key="monster.monsterNo">
                <td align="center">{{ monster.monsterNo }}</td>
                <!--
                <td align="left">
                    <router-link :to="{ name: 'ProductReadPage',
                                    params: { monsterNo: monster.monsterNo.toString() } }">
                        {{ monster.name }}
                    </router-link> 
                </td>
                -->
                <td align="right">{{ monster.name }}</td>
                <td align="right">{{ monster.hp }}</td>
                <td align="right">{{ monster.atk }}</td>
                <td align="center">{{ monster.regDate }}</td>
            </tr>
        </table>
    </div>
</template>

<script>
export default {
    name: 'MonsterBookList',
    props: {
        Monsters: {
            type: Array
        }
    }
}
</script>