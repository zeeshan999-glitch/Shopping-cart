package com.idealo.shoppingcart.config;

import java.util.HashMap;
import java.util.Map;

import com.idealo.shoppingcart.model.Item;
import com.idealo.shoppingcart.model.Offer;
import com.idealo.shoppingcart.model.Sku;
import com.idealo.shoppingcart.service.PricingService;

public class DefaultPricingRules {

	public static PricingService getPricingRules() {
		Map<String, Item> pricingRulesMap = new HashMap<String, Item>();
		pricingRulesMap.put("A", new Item(new Sku("A", 40)));		
		pricingRulesMap.put("B", new Item(new Sku("B", 50)));
		pricingRulesMap.put("C", new Item(new Sku("C", 25)));		
		pricingRulesMap.put("D", new Item(new Sku("D", 20)));
		
		pricingRulesMap.put("A", new Item(new Sku("A", 40), new Offer(1, 40)));
		pricingRulesMap.put("B", new Item(new Sku("B", 50), new Offer(2, 75) ));
		pricingRulesMap.put("C", new Item(new Sku("C", 25)));		
		pricingRulesMap.put("D", new Item(new Sku("D", 20)));
		
		pricingRulesMap.put("A", new Item(new Sku("A", 40), new Offer(1, 40)));
		pricingRulesMap.put("B", new Item(new Sku("B", 25), new Offer(2, 75)));
		pricingRulesMap.put("C", new Item(new Sku("C", 25), new Offer(1, 0) ));		
		pricingRulesMap.put("D", new Item(new Sku("D", 20)));
		
		
		pricingRulesMap.put("A", new Item(new Sku("A", 40), new Offer(1, 40)));
		pricingRulesMap.put("B", new Item(new Sku("B", 25), new Offer(2, 75)));
		pricingRulesMap.put("C", new Item(new Sku("C", 25), new Offer(1, 0) ));		
		pricingRulesMap.put("D", new Item(new Sku("D", 20), new Offer(1, 20) ));
		
		
		
		return new PricingService(pricingRulesMap);
	}
}
