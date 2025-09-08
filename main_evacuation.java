totalEvacuation = people.size();
evacuationStartTime = time();
event.restart();
checkbox.setSelected(true);


create_MyDynamicEvent1(getResponseTime());
create_MyDynamicEvent2(getResponseTime());
create_MyDynamicEvent3(getResponseTime());
create_MyDynamicEvent4(getResponseTime());
create_MyDynamicEvent5(getResponseTime());
create_MyDynamicEvent6(getResponseTime());
create_MyDynamicEvent7(getResponseTime());
create_MyDynamicEvent8(getResponseTime());
create_MyDynamicEvent9(getResponseTime());
create_MyDynamicEvent10(getResponseTime());
create_MyDynamicEvent11(getResponseTime());
create_MyDynamicEvent12(getResponseTime());
create_MyDynamicEvent13(getResponseTime());

for(int i = 0 ; i < 100 ; i++){
traceln(getResponseTime());
}