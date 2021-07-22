<template>
    <div>
        <h3>Monster Modified Form</h3>
        <form @submit.prevent="onSubmit">
            <table>
                <tr>
                    <td>몬스터 번호</td>
                    <td><input type="text" :value="monster.monsterNo" disabled></td>
                </tr>
                <tr>
                    <td>등록일자</td>
                    <td><input type="text" :value="monster.regDate" disabled></td>
                </tr>
                <tr>
                    <td>몬스터 이름</td>
                    <td><input type="text" v-model="name"></td>
                </tr>
                <tr>
                    <td>hp</td>
                    <td><input type="text" v-model="hp"></td>
                </tr>
                <tr>
                    <td>exp</td>
                    <td><input type="text" v-model="exp"></td>
                </tr>
            </table>

            <div>
                <button type="submit">수정 완료</button>
                <router-link :to="{ name: 'MonsterReadPage', params: { monsterNo: monster.monsterNo.toString() } }">
                    취소
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
            name: '',
            hp: 0,
            exp: 0
        }
    },
    methods: {
        onSubmit () {
            const { name, hp, exp } = this
            this.$emit('submit', { name, hp, exp })
        }
    },
    created () {
        this.name = this.monster.name
        this.hp = this.monster.hp
        this.exp = this.monster.exp
    }
}
</script>