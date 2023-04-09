package net.mcreator.newblocks.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.potion.RadiationPoisoningPotionEffect;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;
import java.util.Collection;

public class RadiationPoisoningOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure RadiationPoisoningOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) > 2) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 0));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 60, (int) 0));
			if (new Object() {
				int check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
								return effect.getAmplifier();
						}
					}
					return 0;
				}
			}.check(entity) > 6) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 60, (int) 1));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 1));
				if (new Object() {
					int check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
									return effect.getAmplifier();
							}
						}
						return 0;
					}
				}.check(entity) > 8) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 1));
					if (new Object() {
						int check(Entity _entity) {
							if (_entity instanceof LivingEntity) {
								Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
								for (EffectInstance effect : effects) {
									if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
										return effect.getAmplifier();
								}
							}
							return 0;
						}
					}.check(entity) > 12) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 60, (int) 0));
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).removePotionEffect(Effects.STRENGTH);
						}
						if (new Object() {
							int check(Entity _entity) {
								if (_entity instanceof LivingEntity) {
									Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
									for (EffectInstance effect : effects) {
										if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
											return effect.getAmplifier();
									}
								}
								return 0;
							}
						}.check(entity) > 14) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 0));
							if (new Object() {
								int check(Entity _entity) {
									if (_entity instanceof LivingEntity) {
										Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
										for (EffectInstance effect : effects) {
											if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
												return effect.getAmplifier();
										}
									}
									return 0;
								}
							}.check(entity) > 18) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 1));
								if (new Object() {
									int check(Entity _entity) {
										if (_entity instanceof LivingEntity) {
											Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
											for (EffectInstance effect : effects) {
												if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
													return effect.getAmplifier();
											}
										}
										return 0;
									}
								}.check(entity) > 24) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 2));
									if (new Object() {
										int check(Entity _entity) {
											if (_entity instanceof LivingEntity) {
												Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
												for (EffectInstance effect : effects) {
													if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
														return effect.getAmplifier();
												}
											}
											return 0;
										}
									}.check(entity) > 29) {
										entity.setFire((int) 7);
										if (entity instanceof LivingEntity) {
											((LivingEntity) entity).removePotionEffect(Effects.FIRE_RESISTANCE);
										}
										if (entity instanceof LivingEntity)
											((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, (int) 60, (int) 3));
										if (new Object() {
											int check(Entity _entity) {
												if (_entity instanceof LivingEntity) {
													Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
													for (EffectInstance effect : effects) {
														if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
															return effect.getAmplifier();
													}
												}
												return 0;
											}
										}.check(entity) > 34) {
											if (entity instanceof LivingEntity)
												((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 60, (int) 3));
											if (new Object() {
												int check(Entity _entity) {
													if (_entity instanceof LivingEntity) {
														Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
														for (EffectInstance effect : effects) {
															if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
																return effect.getAmplifier();
														}
													}
													return 0;
												}
											}.check(entity) > 38) {
												if (entity instanceof LivingEntity)
													((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 60, (int) 2));
												if (new Object() {
													int check(Entity _entity) {
														if (_entity instanceof LivingEntity) {
															Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
															for (EffectInstance effect : effects) {
																if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
																	return effect.getAmplifier();
															}
														}
														return 0;
													}
												}.check(entity) > 45) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity)
																.addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 0));
													if (new Object() {
														int check(Entity _entity) {
															if (_entity instanceof LivingEntity) {
																Collection<EffectInstance> effects = ((LivingEntity) _entity)
																		.getActivePotionEffects();
																for (EffectInstance effect : effects) {
																	if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
																		return effect.getAmplifier();
																}
															}
															return 0;
														}
													}.check(entity) > 65) {
														if (entity instanceof LivingEntity)
															((LivingEntity) entity)
																	.addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, (int) 60, (int) 1));
														if (new Object() {
															int check(Entity _entity) {
																if (_entity instanceof LivingEntity) {
																	Collection<EffectInstance> effects = ((LivingEntity) _entity)
																			.getActivePotionEffects();
																	for (EffectInstance effect : effects) {
																		if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
																			return effect.getAmplifier();
																	}
																}
																return 0;
															}
														}.check(entity) > 70) {
															if (entity instanceof LivingEntity)
																((LivingEntity) entity).addPotionEffect(
																		new EffectInstance(Effects.INSTANT_DAMAGE, (int) 60, (int) 2));
															entity.setFire((int) 7);
															if (entity instanceof LivingEntity) {
																((LivingEntity) entity).removePotionEffect(Effects.FIRE_RESISTANCE);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (entity instanceof LivingEntity)
																((LivingEntity) entity).addPotionEffect(new EffectInstance(
																		RadiationPoisoningPotionEffect.potion, (int) (new Object() {
																			int check(Entity _entity) {
																				if (_entity instanceof LivingEntity) {
																					Collection<EffectInstance> effects = ((LivingEntity) _entity)
																							.getActivePotionEffects();
																					for (EffectInstance effect : effects) {
																						if (effect
																								.getPotion() == RadiationPoisoningPotionEffect.potion)
																							return effect.getDuration();
																					}
																				}
																				return 0;
																			}
																		}.check(entity) + 50), (int) (new Object() {
																			int check(Entity _entity) {
																				if (_entity instanceof LivingEntity) {
																					Collection<EffectInstance> effects = ((LivingEntity) _entity)
																							.getActivePotionEffects();
																					for (EffectInstance effect : effects) {
																						if (effect
																								.getPotion() == RadiationPoisoningPotionEffect.potion)
																							return effect.getAmplifier();
																					}
																				}
																				return 0;
																			}
																		}.check(entity) + new Random().nextInt(7 + 1)), (false), (true)));
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
