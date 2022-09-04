.class Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;
.super Landroid/widget/ArrayAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/MediaRouteControllerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "VolumeGroupAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/ArrayAdapter",
        "<",
        "Landroid/support/v7/media/MediaRouter$RouteInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final mDisabledAlpha:F

.field final synthetic this$0:Landroid/support/v7/app/MediaRouteControllerDialog;


# direct methods
.method public constructor <init>(Landroid/support/v7/app/MediaRouteControllerDialog;Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/media/MediaRouter$RouteInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    invoke-static {p2}, Landroid/support/v7/app/MediaRouterThemeHelper;->getDisabledAlpha(Landroid/content/Context;)F

    move-result v0

    iput v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->mDisabledAlpha:F

    return-void
.end method


# virtual methods
.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 9

    const/16 v8, 0x64

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez p2, :cond_3

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3200(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Landroid/support/v7/mediarouter/R$layout;->mr_controller_volume_item:I

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :goto_0
    invoke-virtual {p0, p1}, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/media/MediaRouter$RouteInfo;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/support/v7/media/MediaRouter$RouteInfo;->isEnabled()Z

    move-result v5

    sget v1, Landroid/support/v7/mediarouter/R$id;->mr_name:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setEnabled(Z)V

    invoke-virtual {v0}, Landroid/support/v7/media/MediaRouter$RouteInfo;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v1, Landroid/support/v7/mediarouter/R$id;->mr_volume_slider:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/app/MediaRouteVolumeSlider;

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v2}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3200(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/content/Context;

    move-result-object v2

    iget-object v6, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v6}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$700(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/support/v7/app/OverlayListView;

    move-result-object v6

    invoke-static {v2, v1, v6}, Landroid/support/v7/app/MediaRouterThemeHelper;->setVolumeSliderColor(Landroid/content/Context;Landroid/support/v7/app/MediaRouteVolumeSlider;Landroid/view/View;)V

    invoke-virtual {v1, v0}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setTag(Ljava/lang/Object;)V

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v2}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2300(Landroid/support/v7/app/MediaRouteControllerDialog;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v5, :cond_4

    move v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setHideThumb(Z)V

    invoke-virtual {v1, v5}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setEnabled(Z)V

    if-eqz v5, :cond_0

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v2, v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3500(Landroid/support/v7/app/MediaRouteControllerDialog;Landroid/support/v7/media/MediaRouter$RouteInfo;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Landroid/support/v7/media/MediaRouter$RouteInfo;->getVolumeMax()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setMax(I)V

    invoke-virtual {v0}, Landroid/support/v7/media/MediaRouter$RouteInfo;->getVolume()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setProgress(I)V

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v2}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3600(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    :cond_0
    :goto_2
    sget v1, Landroid/support/v7/mediarouter/R$id;->mr_volume_item_icon:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v5, :cond_6

    const/16 v2, 0xff

    :goto_3
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setAlpha(I)V

    sget v1, Landroid/support/v7/mediarouter/R$id;->volume_item_container:I

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iget-object v2, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v2}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$1800(Landroid/support/v7/app/MediaRouteControllerDialog;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v4, 0x4

    :cond_1
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3700(Landroid/support/v7/app/MediaRouteControllerDialog;)Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3700(Landroid/support/v7/app/MediaRouteControllerDialog;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    invoke-direct {v0, v7, v7}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/Animation;->setDuration(J)V

    invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setFillEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    invoke-virtual {p2, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_2
    return-object p2

    :cond_3
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v0, p2}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3400(Landroid/support/v7/app/MediaRouteControllerDialog;Landroid/view/View;)V

    goto/16 :goto_0

    :cond_4
    move v2, v4

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v1, v8}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setMax(I)V

    invoke-virtual {v1, v8}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setProgress(I)V

    invoke-virtual {v1, v4}, Landroid/support/v7/app/MediaRouteVolumeSlider;->setEnabled(Z)V

    goto :goto_2

    :cond_6
    const/high16 v2, 0x437f0000    # 255.0f

    iget v5, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeGroupAdapter;->mDisabledAlpha:F

    mul-float/2addr v2, v5

    float-to-int v2, v2

    goto :goto_3
.end method
