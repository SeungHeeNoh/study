function solution(answers) {
    var answer = [];
	var arr1 = [1, 2, 3, 4, 5],
		arr1Len = arr1.length,
		arr2 = [2, 1, 2, 3, 2, 4, 2, 5],
		arr2Len = arr2.length,
		arr3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5],
		arr3Len = arr3.length;
	var temp = [0, 0, 0];

	for (var i=0; i<answers.length; i++) {

		if (answers[i] == arr1[i%arr1Len]) {
			temp[0]++;
		}

		if (answers[i] == arr2[i%arr2Len]) {
			temp[1]++;
		}

		if (answers[i] == arr3[i%arr3Len]) {
			temp[2]++;
		}
	}

	var max = Math.max.apply(null, temp);
	for (var i=0; i<temp.length; i++) {
		if (temp[i] == max) answer.push(i+1);
	}

	return answer;
}