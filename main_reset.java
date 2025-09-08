event.reset();
event1.reset();
event2.reset();
event3.reset();
event4.reset();
event5.reset();
event6.reset();
event7.reset();
event8.reset();
event9.reset();
event10.reset();
event11.reset();
event12.reset();
event13.reset();
densityMap.hide();
densityMap1.hide();
densityMap2.hide();
level.setVisible(true);
Deck1.setVisible(true);
Deck2.setVisible(true);
Deck3.setVisible(true);


// 初始化pedsources的人数
List<Integer> curPedSourceList = pedSourceList.get(pedSourceIndex);
for (int i = 0; i < curPedSourceList.size(); i++) {
        int arrivals = curPedSourceList.get(i);
        pedsources.get(i).set_maxArrivals(arrivals);
        pedSourceTotal += arrivals;
}
