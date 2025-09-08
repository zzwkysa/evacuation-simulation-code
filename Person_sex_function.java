if(sex==Sex.FEMALE&&age>=2&&age<8.3){
	return 0.06*age+0.5;
}else if(sex==Sex.FEMALE&&age>=8.3&&age<13.3){
return 0.04*age+0.67;
}else if(sex==Sex.FEMALE&&age>=13.3&&age<22.25){
return 0.02*age+0.94;
}else if(sex==Sex.FEMALE&&age>=22.25&&age<37.5){
return -0.018*age+1.78;
}else if(sex==Sex.FEMALE&&age>=37.5){
return -0.01*age+1.45;
}else if(sex==Sex.MALE&&age>=2&&age<5){
return 0.16*age+0.3;
}else if(sex==Sex.MALE&&age>=5&&age<12.5){
return 0.06*age+0.8;
}else if(sex==Sex.MALE&&age>=12.5&&age<18.8){
return 0.008*age+1.45;
}else if(sex==Sex.MALE&&age>=18.8&&age<39.2){
return -0.01*age+1.78;
}else{//(sex==Sex.MALE&&age>=39.2)
return -0.009*age+1.75;
}