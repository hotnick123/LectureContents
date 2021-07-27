<template>
    <div align="center">
        <h2>삼각형 넓이 구하기</h2>
            밑면:<input v-model="bottomline" type="number">
            높이:<input v-model="height" type="number">
            넓이:{{answer}}
    </div>
            
</template>

<script>

export default {
    name: 'TriangleWidthPage',
    data: function() {
            return {
                bottomline: 0,
                height: 0,   
            }
        },
        computed: {
            answer: function() {
                return this.bottomline * this.height / 2;
            }
        }
    }

</script>