.class Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/app/MediaRouteExpandCollapseButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;


# direct methods
.method constructor <init>(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$000(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v1, v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$002(Landroid/support/v7/app/MediaRouteExpandCollapseButton;Z)Z

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$000(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$100(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$100(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$200(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$500(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$500(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$300(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v0}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$300(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    iget-object v0, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    iget-object v1, p0, Landroid/support/v7/app/MediaRouteExpandCollapseButton$1;->this$0:Landroid/support/v7/app/MediaRouteExpandCollapseButton;

    invoke-static {v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->access$400(Landroid/support/v7/app/MediaRouteExpandCollapseButton;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/MediaRouteExpandCollapseButton;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_1
.end method
