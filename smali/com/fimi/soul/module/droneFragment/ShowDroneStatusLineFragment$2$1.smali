.class Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;->onTextChanged(Ljava/lang/CharSequence;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;


# direct methods
.method constructor <init>(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2$1;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2$1;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;

    iget-object v0, v0, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment$2;->a:Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;

    invoke-static {v0}, Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;->g(Lcom/fimi/soul/module/droneFragment/ShowDroneStatusLineFragment;)Lcom/fimi/soul/view/AutoScrollTextView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/view/AutoScrollTextView;->a()V

    return-void
.end method
