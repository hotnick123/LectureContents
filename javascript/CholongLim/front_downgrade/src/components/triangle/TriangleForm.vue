<template>
  <div>
    <ul>
        <li>
            <label for="bottomSide">밑변의 길이 : </label>
            <input type="text" id="bottomSide">cm
        </li>
        <li>
            <label for="triangleHeight">삼각형의 높이 : </label>
            <input type="text" id="triangleHeight">cm
        </li>
        <li>
            <button v-on:click="triangleArea()">삼각형의 넓이는?</button>
        </li>
    </ul>
    <div id="showResult"></div>
  </div>
</template>

<script>

export default {
  methods: {
      triangleArea () {
      var TriangleBottomSide = document.querySelector('#bottomSide').value;
      var Height = document.querySelector('#triangleHeight').value;

      var area = (TriangleBottomSide*Height) * 0.5;

      document.querySelector('#showResult').innerHTML = "삼각형의 넓이는" + area;
    }
  }
}

</script>