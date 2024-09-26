String[] topBands = {"Fall Out Boy", "ImagineDragons", "SomeOtherName...", "I don't know a lot of bands", "Big Time Rush"};
String[] hits = {"That song from Big Hero Six", "Radioactive", "Give me a recomendation", "I like a lot of different songs, just not the bands", "I don't know the name of any song they made"};

for(int i = 0; i < topBands.length; i++){
  println(i+1 + ": " + topBands[i] + " - " + hits[i]);
}
