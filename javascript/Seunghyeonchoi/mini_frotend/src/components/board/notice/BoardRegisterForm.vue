<template>
    <form @submit.prevent="onSubmit">
        <h3>게시물 작성 형태</h3>
        <table>
            <tr>
                <td>제목</td>
                <td><input type="text" v-model="title"></td>
            </tr>
            <tr>
                <td>작성자</td>
                <td><input type="text" v-model="writer"></td>
            </tr>
            <tr>
                <td>본문</td>
                <td><textarea cols="50" rows="20" v-model="content"></textarea></td>
            </tr>
        </table>

        <div>
            <button type="submit">등록</button>
            <router-link :to="{ name: 'NoticeBoardListPage' }">
                취소
            </router-link>
        </div>
    </form>
</template>

<script>
export default {
    name: 'BoardRegisterForm',
    data () {
        return {
            //초기값 세팅
            title: '제목을 작성하세요.',
            writer: '',
            content: '본문을 작성하면 됩니다.'
        }
    },
    methods: {
        onSubmit () {
            const { title, writer, content } = this
            this.$emit('submit', { title, writer, content })
        }
    }
}
</script> 