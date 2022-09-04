.class Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/MediaRouteControllerDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "VolumeChangeListener"
.end annotation


# instance fields
.field private final mStopTrackingTouch:Ljava/lang/Runnable;

.field final synthetic this$0:Landroid/support/v7/app/MediaRouteControllerDialog;


# direct methods
.method private constructor <init>(Landroid/support/v7/app/MediaRouteControllerDialog;)V
    .locals 1

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener$1;

    invoke-direct {v0, p0}, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener$1;-><init>(Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;)V

    iput-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->mStopTrackingTouch:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/app/MediaRouteControllerDialog;Landroid/support/v7/app/MediaRouteControllerDialog$1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;-><init>(Landroid/support/v7/app/MediaRouteControllerDialog;)V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 4

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/media/MediaRouter$RouteInfo;

    invoke-static {}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2400()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "MediaRouteCtrlDialog"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v0, p2}, Landroid/support/v7/media/MediaRouter$RouteInfo;->requestSetVolume(I)V

    :cond_1
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2500(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/support/v7/media/MediaRouter$RouteInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3300(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->mStopTrackingTouch:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/media/MediaRouter$RouteInfo;

    invoke-static {v1, v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$2502(Landroid/support/v7/app/MediaRouteControllerDialog;Landroid/support/v7/media/MediaRouter$RouteInfo;)Landroid/support/v7/media/MediaRouter$RouteInfo;

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->this$0:Landroid/support/v7/app/MediaRouteControllerDialog;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteControllerDialog;->access$3300(Landroid/support/v7/app/MediaRouteControllerDialog;)Landroid/widget/SeekBar;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteControllerDialog$VolumeChangeListener;->mStopTrackingTouch:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/SeekBar;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
