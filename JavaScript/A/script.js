const btn = document.getElementById("btn");
const inputSntP = document.getElementById("input-sentence");
const outputSntP = document.getElementById("output-sentence");

btn.addEventListener("click", () => {
  const sentence = prompt("Enter a sentence");
  inputSntP.innerText = '"' + sentence + '"';

  const wordsArray = sentence.split(" ");

  const reversedWordsArray = wordsArray.map((word) => {
    return word.split("").reverse().join("");
  });

  outputSntP.innerText = '"' + reversedWordsArray.join(" ") + '"';
});
