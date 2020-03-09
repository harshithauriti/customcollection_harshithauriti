package com.customcollection;
public class DifferentLists<L> {
		CustomLists<String> list=new CustomLists<String>();
		public void add(String item) {
			list.add(item);}
		public void remove(int index){
			list.remove(index);
		}
		public int length(){
			return list.size();
		}
		public String print(){
			return list.toString();
		}
		public String get(int index){
			return list.get(index);
		}

	}