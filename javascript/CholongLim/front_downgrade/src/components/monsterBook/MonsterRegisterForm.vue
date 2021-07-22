<template>
    <form @submit.prevent="onSubmit">
        <h3>몬스터 도감 등록 형태</h3>
        <table>
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
            <button type="submit">몬스터 등록</button>
            <router-link :to="{ name: 'MonsterListPage'}">
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
            name: '몬스터 이름',
            hp: 'HP',
            exp: 'EXP'
        }
    },
    methods: {
        onSubmit () {
            const { name, hp, exp } = this
            this.$emit('submit', { name, hp, exp })
        }
    }
}
</script>