.class final Lcom/google/android/gms/wearable/internal/as$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ail$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/as;->b(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)Lcom/google/android/gms/internal/ail$c;
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
        "Lcom/google/android/gms/wearable/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;


# direct methods
.method constructor <init>(Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/as$5;->a:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public a(Lcom/google/android/gms/wearable/c$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wearable/internal/as$5;->a:Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/wearable/internal/ChannelEventParcelable;->a(Lcom/google/android/gms/wearable/c$a;)V

    return-void
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/wearable/c$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wearable/internal/as$5;->a(Lcom/google/android/gms/wearable/c$a;)V

    return-void
.end method
