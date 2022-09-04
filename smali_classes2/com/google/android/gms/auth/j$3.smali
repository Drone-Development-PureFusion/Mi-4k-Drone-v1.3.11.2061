.class final Lcom/google/android/gms/auth/j$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/auth/j;->b(Landroid/content/Context;ILjava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/auth/j$a",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/google/android/gms/auth/AccountChangeEvent;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/auth/j$3;->a:Ljava/lang/String;

    iput p2, p0, Lcom/google/android/gms/auth/j$3;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/auth/AccountChangeEvent;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/sr$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/internal/sr;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    invoke-direct {v1}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;-><init>()V

    iget-object v2, p0, Lcom/google/android/gms/auth/j$3;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->a(Ljava/lang/String;)Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/auth/j$3;->b:I

    invoke-virtual {v1, v2}, Lcom/google/android/gms/auth/AccountChangeEventsRequest;->a(I)Lcom/google/android/gms/auth/AccountChangeEventsRequest;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/sr;->a(Lcom/google/android/gms/auth/AccountChangeEventsRequest;)Lcom/google/android/gms/auth/AccountChangeEventsResponse;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/auth/j;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/AccountChangeEventsResponse;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/AccountChangeEventsResponse;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/auth/j$3;->a(Landroid/os/IBinder;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
