<template>
    <div>
        <h3>Vue + Spring 몬스터 도감 읽기</h3>
        <table>
            <tr>
                <td>몬스터 번호</td>
                <td><input type="text" :value="monster.monsterNo" readonly></td>
            </tr>
            <tr>
                <td>등록일자</td>
                <td><input type="text" :value="monster.regDate" readonly></td>
            </tr>
            <tr>
                <td>몬스터 이름</td>
                <td><input type="text" :value="monster.name" readonly></td>
            </tr>
            <tr>
                <td>hp</td>
                <td><input type="text" :value="monster.hp" readonly></td>
            </tr>
            <tr>
                <td>exp</td>
                <td><input type="text" :value="monster.exp" readonly></td>
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