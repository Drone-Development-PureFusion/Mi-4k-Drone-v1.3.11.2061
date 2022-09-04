.class final Lcom/google/android/gms/wearable/internal/as$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/as;->c(Lcom/google/android/gms/wearable/internal/NodeParcelable;)Lcom/google/android/gms/internal/ail$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ail$c",
        "<",
        "Lcom/google/android/gms/wearable/p$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/NodeParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/NodeParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/as$3;->a:Lcom/google/android/gms/wearable/internal/NodeParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/p$c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as$3;->a:Lcom/google/android/gms/wearable/internal/NodeParcelable;

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/p$c;->a(Lcom/google/android/gms/wearable/o;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/p$c;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/as$3;->a(Lcom/google/android/gms/wearable/p$c;)V

    return-void
.end method
