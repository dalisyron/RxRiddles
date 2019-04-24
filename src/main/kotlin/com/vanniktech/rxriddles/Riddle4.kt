package com.vanniktech.rxriddles

import io.reactivex.Observable
import io.reactivex.ObservableEmitter

object Riddle4 {
  /**
   * Implement a toggle mechanism. Initially we want to return false.
   * Every time [source] emits, we want to negate the previous value.
   *
   * Use case: Some button that can toggle two states. For instance a switch between White & Dark theme.
   */
  fun solve(source: Observable<Unit>): Observable<Boolean> {

    return source.scan(false) {
      x, y -> !x
    }
  }
}