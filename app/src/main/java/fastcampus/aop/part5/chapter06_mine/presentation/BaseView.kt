package fastcampus.aop.part5.chapter06_mine.presentation

interface BaseView<PresenterT : BasePresenter> {

    val presenter: PresenterT
}