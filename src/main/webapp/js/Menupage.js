document.addEventListener("DOMContentLoaded", function () {
    const slider = document.querySelector(".slider");
    const slides = document.querySelectorAll(".slide");
    let slideIndex = 0;

    function updateSlider() {
        slider.style.transform = `translateX(-${slideIndex * 100}%)`;
    }

    function nextSlide() {
        slideIndex = (slideIndex + 1) % slides.length;
        updateSlider();
    }

    // Automatically move to the next slide every 5 seconds
    setInterval(nextSlide, 2000);
});
