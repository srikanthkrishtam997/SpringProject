package com.java.core.designpatterns;

public class FacadeClass {

	// The Facade class provides a simplified interface that interacts with the
	// subsystem components (DVD Player, Projector, Lights, and Screen).
	private LenovoFacade lenovoFacade;
	private HpFacade hpFacade;

	public FacadeClass() {
		super();
	}

	public FacadeClass(LenovoFacade lenovoFacade, HpFacade hpFacade) {
		super();
		this.lenovoFacade = lenovoFacade;
		this.hpFacade = hpFacade;
	}

	public LenovoFacade getLenovoFacade() {
		return lenovoFacade;
	}

	public void setLenovoFacade(LenovoFacade lenovoFacade) {
		this.lenovoFacade = lenovoFacade;
	}

	public HpFacade getHpFacade() {
		return hpFacade;
	}

	public void setHpFacade(HpFacade hpFacade) {
		this.hpFacade = hpFacade;
	}

}
