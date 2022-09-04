.class final Lcom/google/android/gms/wearable/internal/as$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)Lcom/google/android/gms/internal/ail$c;
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
        "Lcom/google/android/gms/wearable/m$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/MessageEventParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/MessageEventParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/as$2;->a:Lcom/google/android/gms/wearable/internal/MessageEventParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/m$b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as$2;->a:Lcom/google/android/gms/wearable/internal/MessageEventParcelable;

    invoke-interface {p1, v0}, Lcom/google/android/gms/wearable/m$b;->a(Lcom/google/android/gms/wearable/n;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/m$b;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/as$2;->a(Lcom/google/android/gms/wearable/m$b;)V

    return-void
.end method
