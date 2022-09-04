.class public Lcom/google/android/gms/internal/tf$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/tm;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/tf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Landroid/view/View;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/abi;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/google/android/gms/internal/abi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/tf$c;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/google/android/gms/internal/tf$c;->b:Lcom/google/android/gms/internal/abi;

    return-void
.end method


# virtual methods
.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$c;->a:Landroid/view/View;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$c;->b:Lcom/google/android/gms/internal/abi;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/tf$c;->a:Landroid/view/View;

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/internal/tm;
    .locals 0

    return-object p0
.end method
