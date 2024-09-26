int[] arr = {28, 230, 9, 310, 72};

void setup(){
  print(getRandom());
}

int getRandom(){
  int randomNumber = arr[int(random(0,arr.length-1))];
  return randomNumber;
}
