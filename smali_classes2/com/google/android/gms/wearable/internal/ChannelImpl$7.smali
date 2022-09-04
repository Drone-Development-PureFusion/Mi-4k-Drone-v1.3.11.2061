.class final Lcom/google/android/gms/wearable/internal/ChannelImpl$7;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/wearable/internal/ab$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/wearable/internal/ChannelImpl;->a(Ljava/lang/String;[Landroid/content/IntentFilter;)Lcom/google/android/gms/wearable/internal/ab$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/wearable/internal/ab$a",
        "<",
        "Lcom/google/android/gms/wearable/c$a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:[Landroid/content/IntentFilter;


# direct methods
.method constructor <init>(Ljava/lang/String;[Landroid/content/IntentFilter;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$7;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$7;->b:[Landroid/content/IntentFilter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/c$a;Lcom/google/android/gms/internal/ail;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/wearable/internal/ar;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/wearable/c$a;",
            "Lcom/google/android/gms/internal/ail",
            "<",
            "Lcom/google/android/gms/wearable/c$a;",
            ">;)V"
        }
    .end annotation

    iget-object v4, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$7;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/wearable/internal/ChannelImpl$7;->b:[Landroid/content/IntentFilter;

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/wearable/internal/ar;->a(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/c$a;Lcom/google/android/gms/internal/ail;Ljava/lang/String;[Landroid/content/IntentFilter;)V

    return-void
.end method

.method public bridge synthetic a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/Object;Lcom/google/android/gms/internal/ail;)V
    .locals 0

    check-cast p3, Lcom/google/android/gms/wearable/c$a;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/wearable/internal/ChannelImpl$7;->a(Lcom/google/android/gms/wearable/internal/ar;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/wearable/c$a;Lcom/google/android/gms/internal/ail;)V

    return-void
.end method
