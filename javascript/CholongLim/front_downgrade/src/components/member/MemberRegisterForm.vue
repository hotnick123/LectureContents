<template>
    <form @submit.prevent="onSignUp">
        <h3>회원가입</h3>
        <table>
            <tr>
                <td>아이디</td>
                <td><input type="text" v-model="id"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input type="password" v-model="password"></td>
            </tr>
        </table>

        <div>
            <button type="submit">회원 가입</button>
            <router-link :to="{ name: 'MemberListPage'}">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>
export default {
    name: 'MemberRegisterForm',
    data () {
        return {
            id: '아이디를 입력하세요.',
            password: '비밀번호를 입력하세요.'
        }
    },
    methods: {
        onSignUp () {
            const { id, pw } = this
            this.$emit('submit', { id, pw })
        }
    }
}
</script>