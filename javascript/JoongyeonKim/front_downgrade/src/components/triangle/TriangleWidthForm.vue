<template>
    <form @submit.prevent="onSubmit">
        <h3>몬스터를 등록하세요!</h3>
        <table>
            <tr>
                <td>밑변</td>
                <td><input type="number" v-model="bottomline"></td>
            </tr>
            <tr>
                <td>높이</td>
                <td><input type="number" v-model="height"></td>
            </tr>
        </table>
        <div>
            <button type="submit">answer</button>
        </div>
    </form>
</template>

<script>
export default {
    name: 'TriangleWidthForm',
    data () {
        return {
            bottomline: '',
            height: ''
        }
    },
    computed: {
        
    },
    methods: {
         onSubmit () {
            const { bottomline, height} = this
            this.$emit('submit', {  bottomline, height  })
        }
    }
}
</script> 
